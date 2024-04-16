package ch.qos.logback.core.util;
/* loaded from: classes.dex */
class CharSequenceState {
    final char c;
    int occurrences = 1;

    public CharSequenceState(char c) {
        this.c = c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void incrementOccurrences() {
        this.occurrences++;
    }
}
