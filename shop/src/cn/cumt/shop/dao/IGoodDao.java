package cn.cumt.shop.dao;
import java.util.List;

import cn.cumt.shop.domain.Good;

public interface IGoodDao {
/*//�����Ʒ
	public int addGood(Good good) ;
//ͨ��ID������Ʒ
	public Good findById(int hid) ;
	//�õ�������Ʒ
	public List<Good> findGoods() throws Exception;
//��ȡ��Ʒ��ID
	public int getId() ;
//������Ʒ
	public int udateGoods(Good good) ;
//�ҵ���ƷID
	public int findIdByName(String hname);*/
	
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
}