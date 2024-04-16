package im.threads.ui.utils;

import im.threads.business.transport.models.AttachmentSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileHelper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "receivedAttachmentSettings", "Lim/threads/business/transport/models/AttachmentSettings;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileHelper$subscribeToAttachments$1 extends ej5 implements Function1<AttachmentSettings, Unit> {
    public static final FileHelper$subscribeToAttachments$1 INSTANCE = new FileHelper$subscribeToAttachments$1();

    FileHelper$subscribeToAttachments$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AttachmentSettings attachmentSettings) {
        invoke2(attachmentSettings);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AttachmentSettings attachmentSettings) {
        AttachmentSettings.Content content = attachmentSettings.getContent();
        if (content != null) {
            FileHelper.INSTANCE.setAttachmentSettings(content);
        }
    }
}
