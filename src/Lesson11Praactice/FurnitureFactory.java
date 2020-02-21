package Lesson11Praactice;

import Lesson11Praactice.Model.Chair;
import Lesson11Praactice.Model.Furniture;
import Lesson11Praactice.Model.Sofa;

public class FurnitureFactory implements FurnitureBasicFunctional, DuplicateFurniture {
    private final int CHAIR_TYPE = 1;
    private final int SOFA_TYPE = 2;

    @Override
    public Furniture create(int type) {
        if (type == CHAIR_TYPE) {
            return new Chair();
        }else if (type == SOFA_TYPE) {
            return new Sofa();
        }
        return null;
    }

    @Override
    public void utilization(Furniture furniture) {
        furniture = null;
    }

    @Override
    public Furniture[] createFurniture(int type, int value) {
        Furniture[] furniture = new Furniture[value];
        for (int i = 0; i < value; i++) {
            furniture[i] = create(type);
        }
        return furniture;
    }
}
