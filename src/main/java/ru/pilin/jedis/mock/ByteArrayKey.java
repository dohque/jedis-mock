package ru.pilin.jedis.mock;

import java.util.Arrays;

public final class ByteArrayKey {

    private final byte[] array;

    public ByteArrayKey(final int... array) {
        if (array == null) {
            throw new IllegalArgumentException("Key cant be null");
        }
        this.array = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 255 || array[i] < 0) {
                throw new IllegalArgumentException("Array elements should be in range [0;255]");
            } else {
                this.array[i] = (byte)array[i];
            }
        }
    }

    public ByteArrayKey(final byte... array) {
        if (array == null) {
            throw new IllegalArgumentException("Key cant be null");
        }
        this.array = new byte[array.length];
        System.arraycopy(array, 0, this.array, 0, array.length);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ByteArrayKey other = (ByteArrayKey) obj;
        if (!Arrays.equals(array, other.array))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ByteArrayKey [array=" + Arrays.toString(array) + "]";
    }
}


