package com.horse.v7mc.common.pageBean;


public class PageUtils {
	
	/**
	 * 分页方法
	 * @param pageBean 
	 * @param processVo
	 * @return
	 */
	public static PageBean getPageInfo(int recordCount, PageBean pageBean) {
		pageBean.setRecordCount(recordCount);
		pageBean.setBeginPageIndex((pageBean.getCurrentPage() -1)* pageBean.getPageSize());
		pageBean.setEndPageIndex(pageBean.getCurrentPage() * pageBean.getPageSize());
		pageBean.setPageCount((pageBean.getRecordCount() + pageBean.getPageSize() - 1) / pageBean.getPageSize());
		return pageBean;
	}


}
