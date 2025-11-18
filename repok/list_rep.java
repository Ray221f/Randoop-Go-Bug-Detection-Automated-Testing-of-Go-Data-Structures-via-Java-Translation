@CheckRep
public boolean repOK() {
    // 1. Check that the underlying array is not null
    if (elements == null) return false;

    // 2. Verify size is within valid bounds:
    //    - Not negative
    //    - Not larger than array capacity
    if (size < 0 || size > elements.length) return false;

    // 3. Check all elements in the active portion (0..size-1):
    //    - No null elements allowed
    //    - All elements must implement Comparable interface
    for (int i = 0; i < size; i++) {
        if (elements[i] == null || !(elements[i] instanceof Comparable)) 
            return false;
    }

    // 4. For fixed-size lists:
    //    - Array length must match initial capacity
    //    - Size cannot exceed initial capacity
    if (fixed && (elements.length != initialCapacity || size > initialCapacity)) 
        return false;

    // 5. For dynamic lists (when not fixed):
    //    - If size is >= 10 and array is larger than 10,
    //      ensure we're not wasting too much space (size*2 >= capacity)
    if (!fixed) {
        if (size >= 10 && elements.length > 10 && size * 2 < elements.length) 
            return false;
    }

    // All invariants satisfied
    return true;
}
