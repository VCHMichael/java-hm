package app.homework_9.main.model;

import java.util.ArrayList;

public class Family {
    private app.homework_9.main.model.Human mother;
    private app.homework_9.main.model.Human father;
    private ArrayList<app.homework_9.main.model.Human> children;
    private app.homework_9.main.model.Pet pet;

    public app.homework_9.main.model.Human getMother() {
        return mother;
    }

    public void setMother(app.homework_9.main.model.Human mother) {
        this.mother = mother;
    }

    public app.homework_9.main.model.Human getFather() {
        return father;
    }

    public void setFather(app.homework_9.main.model.Human father) {
        this.father = father;
    }

    public ArrayList<app.homework_9.main.model.Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<app.homework_9.main.model.Human> children) {
        this.children = children;
    }

    public app.homework_9.main.model.Pet getPet() {
        return pet;
    }

    public void setPet(app.homework_9.main.model.Pet pet) {
        this.pet = pet;
    }

    public Family() {

    }

    public Family(app.homework_9.main.model.Human mother, app.homework_9.main.model.Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<app.homework_9.main.model.Human>();
        mother.setFamily(this);
        father.setFamily(this);

    }

    public void addChild(app.homework_9.main.model.Human child) {
        ArrayList<app.homework_9.main.model.Human> newList = new ArrayList<app.homework_9.main.model.Human>();
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
        ArrayList<app.homework_9.main.model.Human> newArr = new ArrayList<app.homework_9.main.model.Human>(children);
        newArr.remove(index);
        children = newArr;
        return true;
    }

    public int countFamily() {
        return children.size() + 2;
    }

    void addPet(app.homework_9.main.model.Pet pet) {
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
