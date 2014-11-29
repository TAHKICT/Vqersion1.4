package DBHibernate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: админ
 * Date: 28.11.14
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "currency")
public class ExchangeBase {
    private Integer id;
    private String TTime;
    private Float USDbuy,USDsell,EURbuy,EURsell;

    public ExchangeBase(){}

    public ExchangeBase(Integer id, String TTime, Float USDbuy, Float USDsell, Float EURbuy, Float EURsell){
        this.id = id;
        this.TTime = TTime;
        this.USDbuy = USDbuy;
        this.USDsell = USDsell;
        this.EURbuy = EURbuy;
        this.EURsell = EURsell;
    }
    @Id
    @Column(name="id")
    public Integer getId() {
        return id;
    }@Column(name="USDbuy")
    public Float getUSDbuy() {
        return USDbuy;
    }@Column(name="USDsell")
    public Float getUSDsell() {
        return USDsell;
    }@Column(name="EURbuy")
    public Float getEURbuy() {
        return EURbuy;
    }@Column(name="EURsell")
    public Float getEURsell() {
        return EURsell;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setTTime(String TTime){
        this.TTime = TTime;
    }
    public void setUSDbuy(Float USDbuy){
        this.USDbuy = USDbuy;
    }
    public void setUSDsell(Float USDsell){
        this.USDsell = USDsell;
    }
    public void setEURbuy(Float EURbuy){
        this.EURbuy = EURbuy;
    }
    public void setEURsell(Float EURsell){
        this.EURsell = EURbuy;
    }

}
