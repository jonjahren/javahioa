#include <stdio.h>

main() {

	int *i;
	i = 100;

	printf("i har adressen %d og har verdien %d", &i, i);
}