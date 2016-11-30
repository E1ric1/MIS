package cn.cumt.shop.dao;

import java.util.List;


import cn.cumt.shop.domain.Supplier;

public interface ISupplierDao {
	//ͨ通过供应商ID找供应商
	public Supplier findById(int supplierid) ;	
	//遍历供应商信息
    public List<Supplier> findSupplier() throws Exception;
}
