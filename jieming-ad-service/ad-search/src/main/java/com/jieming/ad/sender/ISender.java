package com.jieming.ad.sender;

import com.jieming.ad.mysql.dto.MySqlRowData;

public interface ISender {
    void sender(MySqlRowData mySqlRowData);
}
