package com.bressan.patterns.state;

public interface PackageState {

    void next(Package pkg);
    void previous(Package pkg);
    void printStatus();
}
