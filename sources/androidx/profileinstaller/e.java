package androidx.profileinstaller;
/* compiled from: FileSectionType.java */
/* loaded from: classes.dex */
enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long a;

    e(long j) {
        this.a = j;
    }

    public long i() {
        return this.a;
    }
}
