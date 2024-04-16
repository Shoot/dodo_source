package im.threads.ui.views;

import kotlin.Metadata;
/* compiled from: VoiceTimeLabelFormatter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lim/threads/ui/views/VoiceTimeLabelFormatter;", "Lcj5;", "", "value", "", "getFormattedValue", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class VoiceTimeLabelFormatter implements cj5 {
    @Override // defpackage.cj5
    public String getFormattedValue(float f) {
        return VoiceTimeLabelFormatterKt.formatAsDuration(f);
    }
}
