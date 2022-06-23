namespace Loop
{

    class While
    {
        public void PrintNumbers(int n)
        {
            int i = 1;
            while (i <= n)
            {
                Console.Write("{0} ", i);

                i++;
            }
            Console.WriteLine();
        }

        public int SumOfNumbers(int n)
        {
            int i = 1;
            int sum = 0;
            while (i <= n)
            {
                sum = sum + i;
                i++;
            }
            return sum;
        }

        public void PrintEvenNumbers(int n)
        {
            // int i = 1;
            int i = 2;
            while (i <= n)
            {
                // if (i % 2 == 0)
                // {
                //     Console.Write("{0} ", i);
                // }
                // i++;

                Console.Write("{0} ", i);
                i += 2; // i = i+2;
            }
            Console.WriteLine();
        }

    }

    class For
    {
        public void PrintNumbers(int n)
        {
            for (int i = 1; i <= n; i++)
            {
                Console.Write("{0} ", i);
            }
            Console.WriteLine();
        }

        public int SumOfNumbers(int n)
        {
            int sum = 0;
            for (int i = 1; i <= n; i++)
            {
                sum = sum + i;
            }
            return sum;
        }

        public void PrintEvenNumbers(int n)
        {
            for (int i = 2; i <= n; i += 2)
            {
                // if (i % 2 == 0)
                // {
                //     Console.Write("{0} ", i);
                // }
                // i++;

                Console.Write("{0} ", i);
            }
            Console.WriteLine();
        }

        public void PrintOddNumbers(int n)
        {
            for (int i = 1; i <= n; i++)
            {
                if (i % 2 == 0)
                {
                    continue;
                }
                Console.Write("{0} ", i);
            }
            Console.WriteLine();
        }
        public bool IsPrimeNumber(int n)
        {
            if (n == 1)
            {
                return false;
            }
            if (n == 2)
            {
                return true;
            }
            bool prime = true;
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                {
                    prime = false;
                    break;
                }
            }
            return prime;
        }


        public void GetMatrics(int rows, int columns)
        {
            for (int r = 1; r <= rows; r++)
            {
                for (int c = 1; c <= columns; c++)
                {
                    Console.Write("{0}:{1} ",r,c);
                }
                Console.WriteLine();
            }
        }
    }
}