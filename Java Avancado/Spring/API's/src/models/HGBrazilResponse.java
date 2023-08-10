package models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

import javax.annotation.processing.Generated;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"temp", "date", "city_name", "forecast"})
@Generated("jsonschema2pojo")
@Data
public class HGBrazilResponse {

    @JsonProperty("temp")
    private Integer temp;
    
    @JsonProperty("date")
    private String date;
    
    @JsonProperty("city_name")
    private String cityName;
    
    @JsonProperty("forecast")
    private List<Forecast> forecast = null;

    @JsonProperty("temp")
    public Integer getTemp() {
    
        return temp;
    
    }

    @JsonProperty("temp")
    public void setTemp(Integer temp) {
    
        this.temp = temp;
    
    }

    public HGBrazilResponse withTemp(Integer temp) {
    
        this.temp = temp;
        
        return this;
    
    }

    @JsonProperty("date")
    public String getDate() {
    
        return date;
    
    }

    @JsonProperty("date")
    public void setDate(String date) {
    
        this.date = date;
    
    }

    public HGBrazilResponse withDate(String date) {
    
        this.date = date;
        
        return this;
    
    }

    @JsonProperty("city_name")
    public String getCityName() {
    
        return cityName;
    
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
    
        this.cityName = cityName;
    
    }

    public HGBrazilResponse withCityName(String cityName) {
    
        this.cityName = cityName;
        
        return this;
    
    }

    @JsonProperty("forecast")
    public List<Forecast> getForecast() {
    
        return forecast;
    
    }

    @JsonProperty("forecast")
    public void setForecast(List<Forecast> forecast) {
    
        this.forecast = forecast;
    
    }

    public HGBrazilResponse withForecast(List<Forecast> forecast) {
    
        this.forecast = forecast;
        
        return this;
    
    }

}