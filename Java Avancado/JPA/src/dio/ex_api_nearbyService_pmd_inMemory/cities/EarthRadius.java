/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio.ex_api_nearbyService_pmd_inMemory.cities;

public enum EarthRadius {

    METERS("m", 6378168),
    KILOMETERS("km", 6378.168f),
    MILES("mi", 3958.747716f);

    private final String unit;
    private final float value;

    EarthRadius(final String unit, final float value) {

        this.unit = unit;
        this.value = value;

    }

    public float getValue() {

        return value;

    }

    public String getUnit() {

        return unit;

    }

}
