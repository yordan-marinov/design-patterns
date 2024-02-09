public abstract class HotBeverageWithHook {

    // This is the Template Method
    final void prepare() {
        boilWater();
        brew();
        pourIntoMug();
        if (wantSomeCondiments()) {  // hook
            addCondiments();
        } else {
            System.out.println("Extra condiments are not coming.");
        }
    }

    abstract public void brew();

    abstract public void addCondiments();

    protected boolean wantSomeCondiments() {
        // The hook by default is true. but can be overridden by the concrete class and change behavior
        return false;
    }

    private void boilWater() {
        System.out.println("Boiling water!!!!");
    }

    private void pourIntoMug() {
        System.out.println("Pouring into Mug.");
    }
}
