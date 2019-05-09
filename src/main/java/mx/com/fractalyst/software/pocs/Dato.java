package mx.com.fractalyst.software.pocs;

import mx.com.fractalyst.software.lib.Bitacoreable;

public class Dato implements Bitacoreable {
    private int id;
    private String prop1;
    
    public Dato() {}

    
    public Dato(int id, String prop1) {
        this.id = id;
        this.prop1 = prop1;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the prop1
     */
    public String getProp1() {
        return prop1;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param prop1 the prop1 to set
     */
    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("id").append(Bitacoreable.ASIGNATOR).append(id);
        sb.append(Bitacoreable.SEPARATOR);
        sb.append("prop1").append(Bitacoreable.ASIGNATOR).append(prop1);
        sb.append("}");
        return sb.toString();
    }

}