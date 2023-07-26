package models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "date",
        "max",
        "min"
})
@Generated("jsonschema2pojo")
@Data
public class Forecast {

    @JsonProperty("date")
    private String date;
    @JsonProperty("max")
    private Integer max;
    @JsonProperty("min")
    private Integer min;

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Forecast withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("max")
    public Integer getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(Integer max) {
        this.max = max;
    }

    public Forecast withMax(Integer max) {
        this.max = max;
        return this;
    }

    @JsonProperty("min")
    public Integer getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(Integer min) {
        this.min = min;
    }

    public Forecast withMin(Integer min) {
        this.min = min;
        return this;
    }

}