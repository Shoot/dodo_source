package com.facebook.flipper.core;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class StateSummary {
    public final List<StateElement> mList = new ArrayList();

    /* loaded from: classes2.dex */
    public enum State {
        IN_PROGRESS,
        SUCCESS,
        FAILED,
        UNKNOWN
    }

    /* loaded from: classes2.dex */
    public static class StateElement {
        private final String mName;
        private final State mState;

        public StateElement(String str, State state) {
            this.mName = str;
            this.mState = state;
        }

        public String getName() {
            return this.mName;
        }

        public State getState() {
            return this.mState;
        }
    }

    public void addEntry(String str, String str2) {
        State state;
        try {
            state = State.valueOf(str2);
        } catch (RuntimeException unused) {
            state = State.UNKNOWN;
        }
        this.mList.add(new StateElement(str, state));
    }
}
