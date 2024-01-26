package co.pragra.learning.spring01dec23;

import lombok.Data;

@Data
public class DieselEngine implements IEngine{
    private String engineType;

    public DieselEngine(String engineType){
        this.engineType = engineType;
    }
    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public double getHorsePower() {
        return 150;
    }
}
