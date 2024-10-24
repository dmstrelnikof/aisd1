x = [0, 10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000];

y_1 = [0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2];

p1 = polyfit(x, y_1, 1);

x_values = linspace(0, 100000, 1000); % 100 точек от 0 до 100000

y_values_1 = polyval(p1, x_values); % Вычисляем значения полинома

% Создание нового окна графика
figure;

hold on;

plot(x_values, y_values_1, 'DisplayName', 'График функции временной сложности', 'LineWidth', 1.5); 

% Построение графика с маркерами
plot(x, y_1, 'o', 'MarkerSize', 8, 'DisplayName', 'Экспериментальные точки', 'MarkerEdgeColor', 'k', 'MarkerFaceColor', 'r');

% Настройка графика
xlabel('N'); % Метка оси X

ylabel('T(N)'); % Метка оси Y

title('Hibbard Sort - лучший случай'); % Заголовок графика

legend show; % Показать легенду

grid on; % Включить сетку