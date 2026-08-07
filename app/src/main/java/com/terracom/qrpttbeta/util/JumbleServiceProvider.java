package com.terracom.qrpttbeta.util;

import com.morlunk.jumble.IJumbleService;

public interface JumbleServiceProvider {
    public IJumbleService getService();

    public void addServiceFragment(JumbleServiceFragment fragment);

    public void removeServiceFragment(JumbleServiceFragment fragment);
}
