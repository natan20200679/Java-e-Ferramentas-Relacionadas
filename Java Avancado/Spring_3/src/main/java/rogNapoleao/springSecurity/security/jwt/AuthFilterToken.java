package rogNapoleao.springSecurity.security.jwt;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import rogNapoleao.springSecurity.service.UserDetailServiceImpl;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthFilterToken extends OncePerRequestFilter{

    @Autowired
    private JwtUtils jwtUtil;

    @Autowired
    private UserDetailServiceImpl userDetailService;

    @Override
    protected void doFilterInternal(@SuppressWarnings("null") HttpServletRequest request, 
    @SuppressWarnings("null") HttpServletResponse response, @SuppressWarnings("null") FilterChain filterChain) throws 
    ServletException, IOException {
    
        try {
    
            String jwt = getToken(request);
    
            if(jwt != null && jwtUtil.validateJwtToken(jwt)) {

                String username = jwtUtil.getUsernameToken(jwt);
                UserDetails userDetails = userDetailService.loadUserByUsername(username);
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, 
                null, userDetails.getAuthorities());
                
                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(auth);
            
            }

        } catch(Exception e) {
            
            System.out.println("Ocorreu um erro ao proecssar o token");
        
        }

        filterChain.doFilter(request, response);
    
    }

    private String getToken(HttpServletRequest request) {
    
        String headerToken = request.getHeader("Authorization");
    
        if(StringUtils.hasText(headerToken) && headerToken.startsWith("Bearer")) {
    
            return headerToken.replace("Bearer ","");
    
        }
    
        return null;
    
    }

}