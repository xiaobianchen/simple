package com.simple.util;


import com.simple.model.BaseEntity;

import java.util.List;

/**
 * ���ܸ�Ҫ:��װPagedResult
 * @author xiaobianchen
 * @version 1.0 2016/4/13
 *
 */
public class PagedResult<T> extends BaseEntity {

	/*serialVersionUID*/
	private static final long serialVersionUID = 1L;

	private List<T> dataList;//����

	private long pageNo;//��ǰҳ

	private long pageSize;//����

	private long total;//������

	private long pages;//��ҳ����Ŀ

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public long getPageNo() {
		return pageNo;
	}

	public void setPageNo(long pageNo) {
		this.pageNo = pageNo;
	}

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getPages() {
		return pages;
	}

	public void setPages(long pages) {
		this.pages = pages;
	}
	
}
