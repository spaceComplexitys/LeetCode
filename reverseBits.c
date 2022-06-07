uint32_t reverseBits(uint32_t n) {
    int reversed = 0;
	for (int i = 0; i < sizeof(uint32_t) * 8; i++) {
        /*
        move the first bit 31 places to the right and take just the last bit (using the & 1) and move it 0 places to the left
        move the seconds to first bit to the last bit and take just the last one (using the  & 1) and move it 1 places to the left
        move the third to first bit to the last bit and take just the last bit, then move it 2 places to the left
        etc..
        */
		reversed |= (((n >> (sizeof(uint32_t) * 8 - 1 - i)) & 1) << i);
	}
	return reversed;
}
