package ch.qos.logback.classic.pattern;
/* loaded from: classes.dex */
public class ClassNameOnlyAbbreviator implements Abbreviator {
    @Override // ch.qos.logback.classic.pattern.Abbreviator
    public String abbreviate(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1, str.length());
        }
        return str;
    }
}
