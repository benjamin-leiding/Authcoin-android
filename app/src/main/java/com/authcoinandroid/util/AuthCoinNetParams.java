package com.authcoinandroid.util;

import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.QtumTestNetParams;

public class AuthCoinNetParams {
    public static NetworkParameters getNetParams() {
        return QtumTestNetParams.get();
    }
}