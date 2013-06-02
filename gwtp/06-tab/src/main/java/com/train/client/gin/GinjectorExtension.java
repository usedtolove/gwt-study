package com.train.client.gin;

import com.train.client.resources.AppConstants;
import com.train.client.resources.AppMessages;

public interface GinjectorExtension {
    AppConstants getAppConstants();

    AppMessages getAppMessages();
}
