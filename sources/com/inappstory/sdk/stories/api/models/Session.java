package com.inappstory.sdk.stories.api.models;

import com.inappstory.sdk.network.Required;
import com.inappstory.sdk.network.SerializedName;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class Session {
    private static Session INSTANCE;
    private static final Object lock = new Object();
    public SessionEditor editor;
    @SerializedName("expire_in")
    public int expireIn;
    @Required
    public String id;
    @SerializedName("is_allow_profiling")
    public StatisticPermissions statisticPermissions;
    public long updatedAt;
    public ArrayList<Integer> viewed = new ArrayList<>();
    public List<List<Object>> statistic = new ArrayList();

    public static void clear() {
        synchronized (lock) {
            INSTANCE = null;
        }
    }

    public static Session getInstance() {
        Session session;
        synchronized (lock) {
            try {
                if (INSTANCE == null) {
                    INSTANCE = new Session();
                }
                session = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return session;
    }

    public static boolean needToUpdate() {
        synchronized (lock) {
            try {
                Session session = INSTANCE;
                if (session == null) {
                    return true;
                }
                String str = session.id;
                if (str != null && !str.isEmpty()) {
                    return false;
                }
                return true;
            } finally {
            }
        }
    }

    public static void setInstance(Session session) {
        INSTANCE = session;
    }

    public static void updateStatistic() {
        synchronized (lock) {
            try {
                Session session = INSTANCE;
                if (session == null) {
                    return;
                }
                session.updatedAt = System.currentTimeMillis();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isAllowProfiling() {
        boolean z;
        synchronized (Session.class) {
            try {
                StatisticPermissions statisticPermissions = this.statisticPermissions;
                if (statisticPermissions != null && statisticPermissions.allowProfiling) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    public void save() {
        this.updatedAt = System.currentTimeMillis();
        synchronized (lock) {
            INSTANCE = this;
        }
    }
}
