class Sword<M extends Metal> {
    private M material;

    Sword(M material) {
        this.material = material;
    }

    boolean checkEndurance() {
        return material.getEndurance() > 49;
    }
}

