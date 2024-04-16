package org.slf4j;

import java.io.Closeable;
import java.util.Deque;
import java.util.Map;
import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.helpers.Util;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;
/* loaded from: classes3.dex */
public class MDC {
    private static final String MDC_APAPTER_CANNOT_BE_NULL_MESSAGE = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA";
    static final String NO_STATIC_MDC_BINDER_URL = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
    static final String NULL_MDCA_URL = "http://www.slf4j.org/codes.html#null_MDCA";
    static MDCAdapter mdcAdapter;

    /* loaded from: classes3.dex */
    public static class MDCCloseable implements Closeable {
        private final String key;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            MDC.remove(this.key);
        }

        private MDCCloseable(String str) {
            this.key = str;
        }
    }

    static {
        SLF4JServiceProvider provider = LoggerFactory.getProvider();
        if (provider != null) {
            mdcAdapter = provider.getMDCAdapter();
            return;
        }
        Util.report("Failed to find provider.");
        Util.report("Defaulting to no-operation MDCAdapter implementation.");
        mdcAdapter = new NOPMDCAdapter();
    }

    private MDC() {
    }

    public static void clear() {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.clear();
            return;
        }
        throw new IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
    }

    public static String get(String str) throws IllegalArgumentException {
        if (str != null) {
            MDCAdapter mDCAdapter = mdcAdapter;
            if (mDCAdapter != null) {
                return mDCAdapter.get(str);
            }
            throw new IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    public static Map<String, String> getCopyOfContextMap() {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            return mDCAdapter.getCopyOfContextMap();
        }
        throw new IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
    }

    public static MDCAdapter getMDCAdapter() {
        return mdcAdapter;
    }

    public static String popByKey(String str) {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            return mDCAdapter.popByKey(str);
        }
        throw new IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
    }

    public static void pushByKey(String str, String str2) {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.pushByKey(str, str2);
            return;
        }
        throw new IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
    }

    public static void put(String str, String str2) throws IllegalArgumentException {
        if (str != null) {
            MDCAdapter mDCAdapter = mdcAdapter;
            if (mDCAdapter != null) {
                mDCAdapter.put(str, str2);
                return;
            }
            throw new IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    public static MDCCloseable putCloseable(String str, String str2) throws IllegalArgumentException {
        put(str, str2);
        return new MDCCloseable(str);
    }

    public static void remove(String str) throws IllegalArgumentException {
        if (str != null) {
            MDCAdapter mDCAdapter = mdcAdapter;
            if (mDCAdapter != null) {
                mDCAdapter.remove(str);
                return;
            }
            throw new IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    public static void setContextMap(Map<String, String> map) {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            mDCAdapter.setContextMap(map);
            return;
        }
        throw new IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
    }

    public Deque<String> getCopyOfDequeByKey(String str) {
        MDCAdapter mDCAdapter = mdcAdapter;
        if (mDCAdapter != null) {
            return mDCAdapter.getCopyOfDequeByKey(str);
        }
        throw new IllegalStateException(MDC_APAPTER_CANNOT_BE_NULL_MESSAGE);
    }
}
