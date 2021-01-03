package MyPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shiva
 */
public class PlansBean implements java.io.Serializable {
    private int plan_id;
    private String plan_name;
    private int plan_duration;
    private int plan_price;

    PlansBean(int id,String name,int duration,int price)
    {
        plan_id=id;
        plan_name=name;
        plan_duration=duration;
        plan_price=price;
    }
    
    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public int getPlan_duration() {
        return plan_duration;
    }

    public void setPlan_duration(int plan_duration) {
        this.plan_duration = plan_duration;
    }

    public int getPlan_price() {
        return plan_price;
    }

    public void setPlan_price(int plan_price) {
        this.plan_price = plan_price;
    }
}
