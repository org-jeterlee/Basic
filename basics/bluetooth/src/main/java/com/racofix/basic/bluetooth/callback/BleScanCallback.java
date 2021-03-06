package com.racofix.basic.bluetooth.callback;

import com.racofix.basic.bluetooth.model.BleDevice;

import java.util.List;

public interface BleScanCallback {

    void onLeScan(BleDevice device);

    void onScanPeriodFinish(List<BleDevice> devices);
}
