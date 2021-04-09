package cn.ty.lq;

import java.util.ArrayList;
import java.util.List;

public class pagban<User> {
    public int getTato() {
        return tato;
    }

    public void setTato(int tato) {
        this.tato = tato;
    }

    public int getTotalpag() {
        return totalpag;
    }

    public void setTotalpag(int totalpag) {
        this.totalpag = totalpag;
    }

    public  List<User>  getList() {
        return list;
    }

    public void setList( List<User> list) {
        this.list = list;
    }

    public int getCurrpage() {
        return currpage;
    }

    public void setCurrpage(int currpage) {
        this.currpage = currpage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "pagban{" +
                "tato=" + tato +
                ", totalpag=" + totalpag +
                ", list=" + list +
                ", currpage=" + currpage +
                ", rows=" + rows +
                '}';
    }

    private int  tato; //总记录数
    private  int totalpag; //总页码
    private  List<User> list; //每页的数据
    private  int currpage; //当前的页码
    private int rows;   //每页的条数


}
