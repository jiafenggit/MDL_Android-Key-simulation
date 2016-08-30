package mdl.sinlov.android.key_simulation_root;

/**
 * <pre>
 *     sinlov
 *
 *     /\__/\
 *    /`    '\
 *  ≈≈≈ 0  0 ≈≈≈ Hello world!
 *    \  --  /
 *   /        \
 *  /          \
 * |            |
 *  \  ||  ||  /
 *   \_oo__oo_/≡≡≡≡≡≡≡≡o
 *
 * </pre>
 * Created by "sinlov" on 16/8/30.
 */
public enum EK {

    KEY_NULL,
    KEY_MENU,
    KEYCODE_SOFT_RIGHT,
    KEYCODE_HOME,
    KEYCODE_BACK,
    KEYCODE_CALL,
    KEYCODE_ENDCALL,
    KEYCODE_0,
    KEYCODE_1,
    KEYCODE_2,
    KEYCODE_3,
    KEYCODE_4,
    KEYCODE_5,
    KEYCODE_6,
    KEYCODE_7,
    KEYCODE_8,
    KEYCODE_9,
    KEYCODE_STAR,
    KEYCODE_POUND,
    KEYCODE_DPAD_UP,
    KEYCODE_DPAD_DOWN,
    KEYCODE_DPAD_LEFT,
    KEYCODE_DPAD_RIGHT,
    KEYCODE_DPAD_CENTER,
    KEYCODE_VOLUME_UP,
    KEYCODE_VOLUME_DOWN,
    KEYCODE_POWER,
    KEYCODE_CAMERA,
    KEYCODE_CLEAR,
    KEYCODE_A,
    KEYCODE_B,
    KEYCODE_C,
    KEYCODE_D,
    KEYCODE_E,
    KEYCODE_F,
    KEYCODE_G,
    KEYCODE_H,
    KEYCODE_I,
    KEYCODE_J,
    KEYCODE_K,
    KEYCODE_L,
    KEYCODE_M,
    KEYCODE_N,
    KEYCODE_O,
    KEYCODE_P,
    KEYCODE_Q,
    KEYCODE_R,
    KEYCODE_S,
    KEYCODE_T,
    KEYCODE_U,
    KEYCODE_V,
    KEYCODE_W,
    KEYCODE_X,
    KEYCODE_Y,
    KEYCODE_Z,
    KEYCODE_COMMA,
    KEYCODE_PERIOD,
    KEYCODE_ALT_LEFT,
    KEYCODE_ALT_RIGHT,
    KEYCODE_SHIFT_LEFT,
    KEYCODE_SHIFT_RIGHT,
    KEYCODE_TAB,
    KEYCODE_SPACE,
    KEYCODE_SYM,
    KEYCODE_EXPLORER,
    KEYCODE_ENVELOPE,
    KEYCODE_ENTER,
    KEYCODE_DEL,
    KEYCODE_GRAVE,
    KEYCODE_MINUS,
    KEYCODE_EQUALS,
    KEYCODE_LEFT_BRACKET,
    KEYCODE_RIGHT_BRACKET,
    KEYCODE_BACKSLASH,
    KEYCODE_SEMICOLON,
    KEYCODE_APOSTROPHE,
    KEYCODE_SLASH,
    KEYCODE_AT,
    KEYCODE_NUM,
    KEYCODE_HEADSETHOOK,
    KEYCODE_FOCUS,
    KEYCODE_PLUS,
    KEYCODE_MENU,
    KEYCODE_NOTIFICATION,
    KEYCODE_SEARCH,
    TAG_LAST_KEYCODE;
    //Start IDS
    private static final int BASE_ORDINAL = 1000;

    public int getID() {
        return ordinal() + BASE_ORDINAL;
    }
}
