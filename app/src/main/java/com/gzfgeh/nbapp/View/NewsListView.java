package com.gzfgeh.nbapp.View;

import com.gzfgeh.nbapp.Bean.DataBean;
import com.gzfgeh.nbapp.Bean.ResultBean;

import java.util.List;

/**
 * Description:
 * Created by guzhenfu on 2016/11/2 20:05.
 */

public interface NewsListView extends BaseView{
    void getListData(List<ResultBean> list);
}
