package com.inappstory.sdk.lrudiskcache;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
/* loaded from: classes3.dex */
public class Utils {
    private static String HASH_ALGORITHM = "SHA512";

    public static String hash(@NonNull String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(HASH_ALGORITHM);
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString() + "_u0";
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* loaded from: classes3.dex */
    public static class TimeComparator implements Comparator<CacheJournalItem> {
        public static int compare(long j, long j2) {
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            return i == 0 ? 0 : 1;
        }

        @Override // java.util.Comparator
        public int compare(CacheJournalItem cacheJournalItem, CacheJournalItem cacheJournalItem2) {
            return compare(cacheJournalItem2.getTime(), cacheJournalItem.getTime());
        }
    }
}
