package defpackage;

import java.util.List;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: ReferralSystemView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\b\u0010\u0013\u001a\u00020\u0004H&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002H&J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H&J\b\u0010\u0018\u001a\u00020\u0004H&J\b\u0010\u0019\u001a\u00020\u0004H&J\b\u0010\u001a\u001a\u00020\u0004H&J\b\u0010\u001b\u001a\u00020\u0004H&¨\u0006\u001c"}, d2 = {"Lzb9;", "Lmoxy/MvpView;", "", "earnedSum", "", "ee", "", "yourGift", "yourGiftDesc", "df", "yourFriendGift", "yourFriendGiftDesc", "zb", "M8", "Hf", "", "Lsa9;", "operations", "nd", "sf", "invitedCount", "bb", "maxInviteCount", "og", "l8", "T9", "S5", "s7", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zb9  reason: default package */
/* loaded from: classes2.dex */
public interface zb9 extends MvpView {
    void Hf();

    void M8();

    void S5();

    void T9();

    void bb(int i);

    void df(String str, String str2);

    void ee(int i);

    void l8();

    void nd(List<sa9> list);

    void og(int i, int i2);

    void s7();

    void sf();

    void zb(String str, String str2);
}
