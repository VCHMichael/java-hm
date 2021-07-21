package app.homework_10.main.model;

import java.util.ArrayList;

public class Family {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private Pet pet;

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family() {

    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<Human>();
        mother.setFamily(this);
        father.setFamily(this);

    }

    public void addChild(Human child) {
        ArrayList<Human> newList = new ArrayList<Human>();
        child.setFamily(this);
        newList.add(child);
        children = newList;
    }

    public boolean deleteChild(int index) {
        if (children == null
                || index < 0
                || index >= children.size()) {

            return false;
        }
        ArrayList<Human> newArr = new ArrayList<Human>(children);
        newArr.remove(index);
        children = newArr;
        return true;
    }

    public int countFamily() {
        return children.size() + 2;
    }

    void addPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.println("Family will be removed");
    }

}
