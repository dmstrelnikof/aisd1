x = [0, 10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000];

y_best = [0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2];
y_average = [0, 4, 2, 3, 4, 5, 7, 8, 47, 11, 11];
y_worst = [0, 1, 0, 1, 1, 1, 1, 2, 2, 2, 2];
y_ch = [0, 2, 2, 3, 4, 5, 7, 8, 10, 13, 12];

p1 = polyfit(x, y_best, 2);
p2 = polyfit(x, y_average, 2);
p3 = polyfit(x, y_worst, 2);
p4 = polyfit(x, y_ch, 2);

x_values = linspace(0, 100000, 1000);

y_values_best = polyval(p1, x_values);
y_values_awerage = polyval(p2, x_values);
y_values_worst = polyval(p3, x_values);
y_values_ch = polyval(p4, x_values);

figure;

hold on;

plot(x_values, y_values_best, 'g', 'DisplayName', 'Лучший случай');
plot(x_values, y_values_awerage, 'b', 'DisplayName', 'Средний случай');
plot(x_values, y_values_worst, 'r', 'DisplayName', 'Худший случай');
plot(x_values, y_values_ch, 'm', 'DisplayName', 'Частично отсортированный');

title('Все графики Hibbard Sort');
xlabel('n');
ylabel('T(n)');
legend;
grid on;
hold off;