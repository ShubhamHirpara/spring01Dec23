package co.pragra.learning.spring01dec23;

import lombok.Data;

@Data
public class PetrolEngine implements IEngine{
    private String engineType;

    public PetrolEngine(String engineType){
        this.engineType = engineType;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public double getHorsePower() {
        return 200;
    }
}
