package com.med.model;

public class MedTable {
    private Integer id;

    private String type;

    private String coldHot;

    private String sweat;

    private String pain;

    private String appetite;

    private String pee;

    private String defecate;

    private String appearance;

    private String lady;

    private String thirsty;

    private String energy;

    private String sleep;

    private String pulse;

    private String others;

    private String medName;

    private String ingredients;

    private String result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getColdHot() {
        return coldHot;
    }

    public void setColdHot(String coldHot) {
        this.coldHot = coldHot == null ? null : coldHot.trim();
    }

    public String getSweat() {
        return sweat;
    }

    public void setSweat(String sweat) {
        this.sweat = sweat == null ? null : sweat.trim();
    }

    public String getPain() {
        return pain;
    }

    public void setPain(String pain) {
        this.pain = pain == null ? null : pain.trim();
    }

    public String getAppetite() {
        return appetite;
    }

    public void setAppetite(String appetite) {
        this.appetite = appetite == null ? null : appetite.trim();
    }

    public String getPee() {
        return pee;
    }

    public void setPee(String pee) {
        this.pee = pee == null ? null : pee.trim();
    }

    public String getDefecate() {
        return defecate;
    }

    public void setDefecate(String defecate) {
        this.defecate = defecate == null ? null : defecate.trim();
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance == null ? null : appearance.trim();
    }

    public String getLady() {
        return lady;
    }

    public void setLady(String lady) {
        this.lady = lady == null ? null : lady.trim();
    }

    public String getThirsty() {
        return thirsty;
    }

    public void setThirsty(String thirsty) {
        this.thirsty = thirsty == null ? null : thirsty.trim();
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy == null ? null : energy.trim();
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep == null ? null : sleep.trim();
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse == null ? null : pulse.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName == null ? null : medName.trim();
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients == null ? null : ingredients.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    @Override
    public String toString() {
        return "MedTable{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", coldHot='" + coldHot + '\'' +
                ", sweat='" + sweat + '\'' +
                ", pain='" + pain + '\'' +
                ", appetite='" + appetite + '\'' +
                ", pee='" + pee + '\'' +
                ", defecate='" + defecate + '\'' +
                ", appearance='" + appearance + '\'' +
                ", lady='" + lady + '\'' +
                ", thirsty='" + thirsty + '\'' +
                ", energy='" + energy + '\'' +
                ", sleep='" + sleep + '\'' +
                ", pulse='" + pulse + '\'' +
                ", others='" + others + '\'' +
                ", medName='" + medName + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}