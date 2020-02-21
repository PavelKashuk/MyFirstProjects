package Lesson11Praactice;

import Lesson11Praactice.Model.Clothes;
import Lesson11Praactice.Model.Dress;
import Lesson11Praactice.Model.Shirt;

public class ClothesFactory implements ClothesBasicFunctional, DuplicateClothes {
    private final int DRESS_TYPE = 1;
    private final int SHIRT_TYPE = 2;

    @Override
    public Clothes create(int type) {
        if (type == DRESS_TYPE) {
            return new Dress();
        } else if (type == SHIRT_TYPE) {
            return new Shirt();
        }
        return null;
    }

    @Override
    public void utilization(Clothes clothes) {
        clothes = null;
    }

    @Override
    public Clothes[] createClothes(int type, int value) {
        Clothes[] clothes = new Clothes[value];
        for (int i = 0; i < value; i++) {
            clothes[i] = create(type);
        }
        return clothes;
    }
}
