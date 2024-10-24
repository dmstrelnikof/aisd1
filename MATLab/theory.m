% Определение функций
T_best = @(n) n .* (log(n).^2);


% Значения n
n_values = 0:100000;

% Вычисление значений функций
T_best_values = T_best(n_values);


% Построение графиков
figure;
hold on;

% Лучший случай
plot(n_values, T_best_values, 'g', 'DisplayName', '');




% Настройки графика
title('Графики функций сложности T(n)');
xlabel('n');
ylabel('T(n)');
legend;
grid on;
hold off;
