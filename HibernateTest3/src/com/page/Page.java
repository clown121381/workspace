package com.page;

import javax.persistence.criteria.CriteriaBuilder;

public class Page {
    /**
     *  ����currentPage,perPageRows����������������ҳ��ѯ����߱��Ĳ���
     *  ԭ���ǣ�hibernate�е�Criteria������Query�������ӿڣ�����setFirstResult(Integer firstResult)
     *  ��setMaxResult(Integer maxResult),
     *  �����firstResult����ÿҳ�Ŀ�ʼ����������
     *  ÿҳ��ʼ���������ļ��㹫ʽ�ǣ���currentPage-1��*perPageRows+1,(�������������1��ʼ��)
     *  ����Hibernate�е�firstResult�������Ǵ�0��ʼ�ģ�������hibernate��ÿҳ��ʼ���������ļ��㹫ʽ�ǣ�
     *  (currentPage-1)*perPageRows+1-1=(currentPge-1)*perPageRows.
     *
     *  maxResult����ÿҳ�ܲ�ѯ������¼����Ҳ����perPageRows.
     *
     *  Math.ceil(totalRows/perPageRows)==totalPages;//���Ǹ����ܼ�¼����ÿҳ�ļ�¼�������ҳ���ļ��㹫ʽ��
     */
    private Integer currentPage;//��ǰҳ
    private Integer perPageRows;//ÿҳ�ļ�¼��
    private Integer totalRows;//�ܼ�¼����
    private Integer totalPages;//��ҳ����

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPerPageRows() {
        return perPageRows;
    }

    public void setPerPageRows(Integer perPageRows) {
        this.perPageRows = perPageRows;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}