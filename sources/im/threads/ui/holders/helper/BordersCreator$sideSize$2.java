package im.threads.ui.holders.helper;

import im.threads.ui.config.Config;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: BordersCreator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BordersCreator$sideSize$2 extends ej5 implements Function0<Integer> {
    public static final BordersCreator$sideSize$2 INSTANCE = new BordersCreator$sideSize$2();

    BordersCreator$sideSize$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Config.Companion companion = Config.Companion;
        return Integer.valueOf((int) (companion.getInstance().getScreenSize$threads_release().getWidth() * companion.getInstance().getChatStyle().imageBubbleSize));
    }
}
