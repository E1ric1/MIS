package cn.cumt.shop.dao;
import java.util.List;

import cn.cumt.shop.domain.Good;

public interface IGoodDao {
	//ͨ通过商品ID找商品
	public Good findById(int goodid) ;	
	//添加商品
	public int addGood(Good good) ;
	//遍历商品信息
	public List<Good> findGood() throws Exception;
	//获得ID
    public int getId() ;
    //采购添加库存
    public int udateBuyGood(int number,int goodid) ;
  //遍历商品信息
  	public List<Good> foundGood() throws Exception;
}