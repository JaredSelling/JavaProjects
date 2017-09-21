class Dodge extends Car {
    public Dodge(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Dodge -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Dodge -> accelerate()";
    }

    @Override
    public String brake() {
        return "Dodge -> brake()";
    }
}



