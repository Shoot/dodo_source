package defpackage;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SimpleDateTimeTextProvider.java */
/* renamed from: bla  reason: default package */
/* loaded from: classes3.dex */
public final class bla extends fn2 {
    private static final Comparator<Map.Entry<String, Long>> c = new a();
    private final ConcurrentMap<Map.Entry<u8b, Locale>, Object> b = new ConcurrentHashMap(16, 0.75f, 2);

    /* compiled from: SimpleDateTimeTextProvider.java */
    /* renamed from: bla$a */
    /* loaded from: classes3.dex */
    class a implements Comparator<Map.Entry<String, Long>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SimpleDateTimeTextProvider.java */
    /* renamed from: bla$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final Map<scb, Map<Long, String>> a;
        private final Map<scb, List<Map.Entry<String, Long>>> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Map<scb, Map<Long, String>> map) {
            this.a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (scb scbVar : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(scbVar).entrySet()) {
                    hashMap2.put(entry.getValue(), bla.g(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, bla.c);
                hashMap.put(scbVar, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, bla.c);
            this.b = hashMap;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String a(long j, scb scbVar) {
            Map<Long, String> map = this.a.get(scbVar);
            if (map != null) {
                return map.get(Long.valueOf(j));
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Iterator<Map.Entry<String, Long>> b(scb scbVar) {
            List<Map.Entry<String, Long>> list = this.b.get(scbVar);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <A, B> Map.Entry<A, B> g(A a2, B b2) {
        return new AbstractMap.SimpleImmutableEntry(a2, b2);
    }

    private static b h(Map<scb, Map<Long, String>> map) {
        map.put(scb.FULL_STANDALONE, map.get(scb.FULL));
        map.put(scb.SHORT_STANDALONE, map.get(scb.SHORT));
        scb scbVar = scb.NARROW;
        if (map.containsKey(scbVar)) {
            scb scbVar2 = scb.NARROW_STANDALONE;
            if (!map.containsKey(scbVar2)) {
                map.put(scbVar2, map.get(scbVar));
            }
        }
        return new b(map);
    }

    private Object i(u8b u8bVar, Locale locale) {
        if (u8bVar == h71.B) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap = new HashMap();
            String[] months = dateFormatSymbols.getMonths();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(1L, months[0]);
            hashMap2.put(2L, months[1]);
            hashMap2.put(3L, months[2]);
            hashMap2.put(4L, months[3]);
            hashMap2.put(5L, months[4]);
            hashMap2.put(6L, months[5]);
            hashMap2.put(7L, months[6]);
            hashMap2.put(8L, months[7]);
            hashMap2.put(9L, months[8]);
            hashMap2.put(10L, months[9]);
            hashMap2.put(11L, months[10]);
            hashMap2.put(12L, months[11]);
            hashMap.put(scb.FULL, hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(1L, l(1, months[0], locale));
            hashMap3.put(2L, l(2, months[1], locale));
            hashMap3.put(3L, l(3, months[2], locale));
            hashMap3.put(4L, l(4, months[3], locale));
            hashMap3.put(5L, l(5, months[4], locale));
            hashMap3.put(6L, l(6, months[5], locale));
            hashMap3.put(7L, l(7, months[6], locale));
            hashMap3.put(8L, l(8, months[7], locale));
            hashMap3.put(9L, l(9, months[8], locale));
            hashMap3.put(10L, l(10, months[9], locale));
            hashMap3.put(11L, l(11, months[10], locale));
            hashMap3.put(12L, l(12, months[11], locale));
            hashMap.put(scb.NARROW, hashMap3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap hashMap4 = new HashMap();
            hashMap4.put(1L, shortMonths[0]);
            hashMap4.put(2L, shortMonths[1]);
            hashMap4.put(3L, shortMonths[2]);
            hashMap4.put(4L, shortMonths[3]);
            hashMap4.put(5L, shortMonths[4]);
            hashMap4.put(6L, shortMonths[5]);
            hashMap4.put(7L, shortMonths[6]);
            hashMap4.put(8L, shortMonths[7]);
            hashMap4.put(9L, shortMonths[8]);
            hashMap4.put(10L, shortMonths[9]);
            hashMap4.put(11L, shortMonths[10]);
            hashMap4.put(12L, shortMonths[11]);
            hashMap.put(scb.SHORT, hashMap4);
            return h(hashMap);
        } else if (u8bVar == h71.t) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap5 = new HashMap();
            String[] weekdays = dateFormatSymbols2.getWeekdays();
            HashMap hashMap6 = new HashMap();
            hashMap6.put(1L, weekdays[2]);
            hashMap6.put(2L, weekdays[3]);
            hashMap6.put(3L, weekdays[4]);
            hashMap6.put(4L, weekdays[5]);
            hashMap6.put(5L, weekdays[6]);
            hashMap6.put(6L, weekdays[7]);
            hashMap6.put(7L, weekdays[1]);
            hashMap5.put(scb.FULL, hashMap6);
            HashMap hashMap7 = new HashMap();
            hashMap7.put(1L, k(1, weekdays[2], locale));
            hashMap7.put(2L, k(2, weekdays[3], locale));
            hashMap7.put(3L, k(3, weekdays[4], locale));
            hashMap7.put(4L, k(4, weekdays[5], locale));
            hashMap7.put(5L, k(5, weekdays[6], locale));
            hashMap7.put(6L, k(6, weekdays[7], locale));
            hashMap7.put(7L, k(7, weekdays[1], locale));
            hashMap5.put(scb.NARROW, hashMap7);
            String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
            HashMap hashMap8 = new HashMap();
            hashMap8.put(1L, shortWeekdays[2]);
            hashMap8.put(2L, shortWeekdays[3]);
            hashMap8.put(3L, shortWeekdays[4]);
            hashMap8.put(4L, shortWeekdays[5]);
            hashMap8.put(5L, shortWeekdays[6]);
            hashMap8.put(6L, shortWeekdays[7]);
            hashMap8.put(7L, shortWeekdays[1]);
            hashMap5.put(scb.SHORT, hashMap8);
            return h(hashMap5);
        } else if (u8bVar == h71.s) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap9 = new HashMap();
            String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
            HashMap hashMap10 = new HashMap();
            hashMap10.put(0L, amPmStrings[0]);
            hashMap10.put(1L, amPmStrings[1]);
            hashMap9.put(scb.FULL, hashMap10);
            hashMap9.put(scb.SHORT, hashMap10);
            return h(hashMap9);
        } else if (u8bVar == h71.Z) {
            DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap11 = new HashMap();
            String[] eras = dateFormatSymbols4.getEras();
            HashMap hashMap12 = new HashMap();
            hashMap12.put(0L, eras[0]);
            hashMap12.put(1L, eras[1]);
            hashMap11.put(scb.SHORT, hashMap12);
            if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                HashMap hashMap13 = new HashMap();
                hashMap13.put(0L, "Before Christ");
                hashMap13.put(1L, "Anno Domini");
                hashMap11.put(scb.FULL, hashMap13);
            } else {
                hashMap11.put(scb.FULL, hashMap12);
            }
            HashMap hashMap14 = new HashMap();
            hashMap14.put(0L, eras[0].substring(0, 1));
            hashMap14.put(1L, eras[1].substring(0, 1));
            hashMap11.put(scb.NARROW, hashMap14);
            return h(hashMap11);
        } else if (u8bVar == v75.b) {
            HashMap hashMap15 = new HashMap();
            HashMap hashMap16 = new HashMap();
            hashMap16.put(1L, "Q1");
            hashMap16.put(2L, "Q2");
            hashMap16.put(3L, "Q3");
            hashMap16.put(4L, "Q4");
            hashMap15.put(scb.SHORT, hashMap16);
            HashMap hashMap17 = new HashMap();
            hashMap17.put(1L, "1st quarter");
            hashMap17.put(2L, "2nd quarter");
            hashMap17.put(3L, "3rd quarter");
            hashMap17.put(4L, "4th quarter");
            hashMap15.put(scb.FULL, hashMap17);
            return h(hashMap15);
        } else {
            return "";
        }
    }

    private Object j(u8b u8bVar, Locale locale) {
        Map.Entry<u8b, Locale> g = g(u8bVar, locale);
        Object obj = this.b.get(g);
        if (obj == null) {
            this.b.putIfAbsent(g, i(u8bVar, locale));
            return this.b.get(g);
        }
        return obj;
    }

    private String k(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    private String l(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        if (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) {
            return Integer.toString(i);
        }
        return str.substring(0, 1);
    }

    @Override // defpackage.fn2
    public String c(u8b u8bVar, long j, scb scbVar, Locale locale) {
        Object j2 = j(u8bVar, locale);
        if (j2 instanceof b) {
            return ((b) j2).a(j, scbVar);
        }
        return null;
    }

    @Override // defpackage.fn2
    public Iterator<Map.Entry<String, Long>> d(u8b u8bVar, scb scbVar, Locale locale) {
        Object j = j(u8bVar, locale);
        if (j instanceof b) {
            return ((b) j).b(scbVar);
        }
        return null;
    }
}
