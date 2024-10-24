% Определение функций
T_best = @(n) (n .* (n-1)) / 2;
T_avg = @(n) (n .* (n-1)) / 4;
T_worst = @(n) (n-1) / 2;

% Значения n
n_values = 0:100000;

% Вычисление значений функций
T_best_values = T_best(n_values);
T_avg_values = T_avg(n_values);
T_worst_values = T_worst(n_values);

% Построение графиков
figure;
hold on;

% Лучший случай
plot(n_values, T_best_values, 'g', 'DisplayName', 'Лучший случай');

% Средний случай
plot(n_values, T_avg_values, 'b', 'DisplayName', 'Средний случай');

% Худший случай
plot(n_values, T_worst_values, 'r', 'DisplayName', 'Худший случай');

% Настройки графика
title('Графики функций сложности T(n)');
xlabel('n');
ylabel('T(n)');
legend;
grid on;
hold off;
