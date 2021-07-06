package app.homework_6.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
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
        this.children = new Human[0];
        mother.setFamily(this);
        father.setFamily(this);

    }

    public void addChild(Human child) {
        ArrayList<Human> newList = new ArrayList<>(Arrays.asList(children));
        child.setFamily(this);
        newList.add(child);
        children = newList.toArray(children);
    }

    public boolean deleteChild(int index) {
        if (children == null
                || index < 0
                || index >= children.length) {

            return false;
        }
        Human[] newArr = new Human[children.length - 1];
        for (int i = 0, k = 0; i < children.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[k++] = children[i];
        }
        children = newArr;
        return true;
    }

    public int countFamily() {
        return children.length + 2;
    }

    void addPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    protected void finalize() {
        System.out.println("Family will be removed");
    }

}
