package com.facebook.flipper.testing;

import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperResponder;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class FlipperResponderMock implements FlipperResponder {
    public final List<Object> successes = new LinkedList();
    public final List<FlipperObject> errors = new LinkedList();

    @Override // com.facebook.flipper.core.FlipperResponder
    public void error(FlipperObject flipperObject) {
        this.errors.add(flipperObject);
    }

    @Override // com.facebook.flipper.core.FlipperResponder
    public void success(FlipperObject flipperObject) {
        this.successes.add(flipperObject);
    }

    @Override // com.facebook.flipper.core.FlipperResponder
    public void success(FlipperArray flipperArray) {
        this.successes.add(flipperArray);
    }

    @Override // com.facebook.flipper.core.FlipperResponder
    public void success() {
        this.successes.add(new FlipperObject.Builder().build());
    }
}
