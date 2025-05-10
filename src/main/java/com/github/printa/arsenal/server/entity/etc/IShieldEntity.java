package com.github.printa.arsenal.server.entity.etc;

public interface IShieldEntity {

    int getShieldCooldownTime();

    void setShieldCooldownTime(int shieldCooldownTime);

    void disableShield(boolean guaranteeDisable);

    boolean isShieldDisabled();

}
